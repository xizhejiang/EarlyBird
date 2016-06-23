package com.algorithm.Prepare;

import java.util.ArrayList;

class Solution {
        ArrayList<Integer> list=new ArrayList();
        public void inOrderTraverse(TreeNode root){
            if(null==root)
                    return;
             inOrderTraverse(root.left);
             list.add(root.val);
             inOrderTraverse(root.right);
        }
        public boolean isValidBST(TreeNode root) {
            inOrderTraverse(root);
            for(int i=0;i<list.size()-1;i++){
                    if(list.get(i+1)<=list.get(i))
                        return false;
                    }
                    return true;
        }
}
class TreeNode {
             int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x;  }
}
