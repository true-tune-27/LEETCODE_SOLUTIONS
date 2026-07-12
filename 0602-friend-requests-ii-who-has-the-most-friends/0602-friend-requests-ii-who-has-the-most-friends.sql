with base as(
    select requester_id from RequestAccepted
    union all
    select accepter_id from RequestAccepted;
),
friends_count as
(
    select requester_id, count(*) as num from base group by requester_id
)
select requester_id as id, num
from friends_count where num = (select max(num) from friends_count);