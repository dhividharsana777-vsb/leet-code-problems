class Solution {
    List<List<Integer>> levelOrderBottomUp= new ArrayList<>();
    ArrayList<Integer> level = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         
        if(root==null)
            return levelOrderBottomUp;
        Queue <TreeNode> queue= new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty())
        {
            TreeNode currentNode=queue.remove();

            if(currentNode==null)
            {
                levelOrderBottomUp.add(0,level);
                if(queue.isEmpty())
                {
                    return levelOrderBottomUp;
                }
                
                queue.add(null); 
                level=new ArrayList<>();
            }
            else
            {
                level.add(currentNode.val);
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                if(currentNode.right!=null)
                    queue.add(currentNode.right);
                
            }
            
        }

        return levelOrderBottomUp;
    }
}
