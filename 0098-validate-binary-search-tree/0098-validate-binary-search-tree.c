/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isValidBST(struct TreeNode* root) {
    int A[10000], j=0;
    void inorder(struct TreeNode* root){
    if(root)
    {
           inorder(root->left);
           A[j++] = root->val;
           inorder(root->right);
    }
    }
    inorder(root);
    //check the array is in strictly ascending order
    for(int i=0; i< j-1 ; i++)
    {
        if(A[i] >= A[i+1])
        {
            return false;
        }
    }
    return true;
}