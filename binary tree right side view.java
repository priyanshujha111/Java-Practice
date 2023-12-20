class Solution {
       public static int max_level ;
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> al = new ArrayList<>();
        max_level =0 ;
        
      if (root == null)
      return al;
      
        
      rightV(al, root,1);
      
      
      return al;
    }
    static void rightV( List a,TreeNode root, int level)
        {
        if (root ==null)
         return;
        
        
        if(max_level<level)
        {
            // System.out.print(root.data + " ");
            a.add(root.val);
            max_level = level;
        }
        
        rightV(a, root.right, level+1);
        rightV(a, root.left, level+1);
        
    } 
    
}