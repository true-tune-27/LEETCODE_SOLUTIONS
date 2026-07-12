/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int countNodes(struct TreeNode* root) {
    int j=0;    
    void my_InOrder(struct TreeNode * root) {
        if (root != NULL) {
            my_InOrder(root->left);
            j++;
            my_InOrder(root->right);
        }
    }
    my_InOrder(root); // Calling Function.
     return j;
    
}