/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* searchBST(struct TreeNode* root, int val) {
    struct TreeNode *temp = root;
    while(temp != NULL)
    {
        //3 cases temp->val == val
        if(temp->val == val) return temp;
        else if(temp->val > val)//2. if the searching value is less than the node value
        {
            temp = temp->left;
        }
        else temp = temp->right;//2. if the searching value is greater than the node value
    }
    return NULL;
    

    
}