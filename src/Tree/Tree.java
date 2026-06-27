package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public Tree left;
    public Tree right;
    public int val;
    public Tree(int val, Tree left, Tree right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
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
        traverseDFS(root);
        bfs(root);
    }
    public static void bfs(Tree root){
        Queue<Tree> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len>0) {
                Tree curr = queue.poll();
                System.out.print(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
                len--;
            }
            System.out.println();
        }

    }
    public static void traverseDFS(Tree root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        traverseDFS(root.left);
        traverseDFS(root.right);
    }
    public static void creationTree(Tree root,HashMap<Integer,int[]> map){
        if(!map.containsKey(root.val)) {
            return;
        }
        root.left=new Tree(map.get(root.val)[0],null,null);
        creationTree(root.left,map);
        root.right=new Tree(map.get(root.val)[1],null,null);
        creationTree(root.right,map);
    }
}
