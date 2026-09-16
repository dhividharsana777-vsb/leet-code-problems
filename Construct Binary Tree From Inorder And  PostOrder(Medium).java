class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    TreeNode link(int inorder[],int postorder[],int fi,int li,int post[]){
        if(fi>li) return null;
        TreeNode root=new TreeNode(postorder[post[0]]);//
        int idx=-1;
        if(map.containsKey(postorder[post[0]]))idx=map.get(postorder[post[0]]);
        post[0]--;
        root.right=link(inorder,postorder,idx+1,li,post);
        root.left=link(inorder,postorder,fi,idx-1,post);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int post[]={postorder.length-1};
        return link(inorder,postorder,0,inorder.length-1,post);
    }
}
