/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int* Output = (int*)malloc(100*sizeof(int));
    int j=0;
    
    void my_InOrder(struct TreeNode * root) {
        if (root != NULL) {
            my_InOrder(root->left);
            Output[j++] = root->val;
            my_InOrder(root->right);
        }
    }
    my_InOrder(root); // Calling Function.
    *returnSize = j;
    return Output;
}