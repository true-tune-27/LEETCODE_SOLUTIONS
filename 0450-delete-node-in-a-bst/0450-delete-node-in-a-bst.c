/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int get_successor(struct TreeNode *current)
 //helper function in inorder successor
 { 
    struct TreeNode *temp = current;
      while(temp->left != NULL)
        {
            temp = temp->left;
        }
        return temp->val;
 }
struct TreeNode* deleteNode(struct TreeNode* root, int key)
{
    if(root == NULL) return NULL;//base case
    else if(root->val > key)
    {
        root->left = deleteNode(root->left,key);

    }
    else if(root->val < key)
    {
        root->right = deleteNode(root->right,key);
    }
    else
    {
        //what to do when we find key 
        //3 cases
        //case1: No child
        if(root->left == NULL && root->right == NULL)
        {
            free(root);//deallocate the memory
             return NULL;
        }
        //case2:One children
        else if(root->left == NULL || root->right == NULL)
        {
            struct TreeNode* temp;
            if(root->left == NULL)//we have right child
            {
                temp = root->right;
            }
            else//we have ledt child
            {
                temp = root->left;
            }
            free(root);
        return temp;
        }
        //case3: two child
        else
        {
            //1.Inorder Succesor value 
            //2.Replace the rrot->val with inorder succeessor value
            //3.Delete Inorder Successor
            int in_o_successor = get_successor(root->right);
            root->val = in_o_successor;
            root->right = deleteNode(root->right,in_o_successor);
        }
    }
    return root;
}

