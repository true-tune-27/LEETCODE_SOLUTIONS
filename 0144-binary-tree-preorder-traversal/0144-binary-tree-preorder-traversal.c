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
int* preorderTraversal(struct TreeNode* root, int* returnSize) {
    int j = 0;
    int* output = (int*)malloc(100*sizeof(int));
    void my_preorder(struct TreeNode* root)
    {
        if(root != NULL){
        output[j++] = root->val;
        my_preorder(root->left);
        my_preorder(root->right);
        }
    }
    my_preorder(root);
    *returnSize = j;
    return output;
    
}