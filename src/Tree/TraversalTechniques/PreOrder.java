package Tree.TraversalTechniques;
import Tree.Tree;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import static Tree.Tree.creationTree;

public class PreOrder {
    public static void main(String[] args) {
        Tree root=new Tree(1,null,null);
        int[][] nodes={{1,2,3},{2,4,5},{3,6,7}};
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<nodes.length;i++){
            int p=nodes[i][0];
            int l=nodes[i][1];
            int r=nodes[i][2];
            map.put(p,new int[]{l,r});
        }
        creationTree(root,map);
        preOrder(root);

    }
    public static void preOrder(Tree root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
