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
int* postorderTraversal(struct TreeNode* root, int* returnSize) {
    int* output = (int*)malloc(100*sizeof(int));
    int j=0;
    void my_postorder(struct TreeNode* root)
    {
        if(root != NULL)
        {
        my_postorder(root->left);
        my_postorder(root->right);
        output[j++] = root->val;
        }
    }
    my_postorder(root);
    *returnSize=j;
    return output;
    
}