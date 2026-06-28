package Tree;
import java.lang.annotation.Target;
import java.util.HashMap;
public class heightTree {
    public static void main(String[] args) {

        HashMap<Integer,Integer[]> tree=new HashMap<>();
        tree.put(10, new Integer[]{1, 2, 3});
        tree.put(1, new Integer[]{11, 21, 31});
        tree.put(2, new Integer[]{20, 30, 40});
        tree.put(3, new Integer[]{32, null, 42});
        tree.put(11, new Integer[]{null, 60, null});
        tree.put(21, new Integer[]{null, null, null});
        tree.put(31, new Integer[]{100, 101, 102});
        tree.put(20, new Integer[]{null, 36, null});
        tree.put(30, new Integer[]{null, null, null});
        tree.put(40, new Integer[]{null, null, null});
        tree.put(32, new Integer[]{90, 91, 92});
        tree.put(42, new Integer[]{null, null, null});
        tree.put(60, new Integer[]{null, null, null});
        tree.put(100, new Integer[]{null, null, null});
        tree.put(101, new Integer[]{null, null, null});
        tree.put(102, new Integer[]{null, null, null});

        tree.put(36, new Integer[]{null, null, null});
        tree.put(90, new Integer[]{null, null, null});
        tree.put(91, new Integer[]{null, null, null});
        tree.put(92, new Integer[]{null, null, null});
        Integer root=10;
        int height=heightOfTree(root,tree);
        System.out.println(height);
        int max=maxValueInTree(root,tree);
        System.out.println(max);
        int tar=92;
        int target=findTargetInTree(root,tree,tar);
        System.out.println(target);

    }
    public static int heightOfTree(Integer root,HashMap<Integer,Integer[]> tree){
        if(root==null){
            return 0;
        }
        Integer[] curr=tree.get(root);
        int a=heightOfTree(curr[0],tree)+1;
        int b=heightOfTree(curr[1],tree)+1;
        int c=heightOfTree(curr[2],tree)+1;
        return Math.max(a,Math.max(b,c));
    }

    public static int maxValueInTree(Integer root,HashMap<Integer,Integer[]> tree){
        if(root==null){
            return 0;
        }
        Integer[] curr=tree.get(root);
        int a=maxValueInTree(curr[0],tree);
        int b=maxValueInTree(curr[1],tree);
        int c=maxValueInTree(curr[2],tree);
        return Math.max(Math.max(a,Math.max(b,c)),root);
    }
    public static int findTargetInTree(Integer root,HashMap<Integer,Integer[]> tree,int tar){
        if(root==null){
            return 0;
        }
        Integer[] curr=tree.get(root);
        int a=findTargetInTree(curr[0],tree,tar);
        int b=findTargetInTree(curr[1],tree,tar);
        int c=findTargetInTree(curr[2],tree,tar);
        if(a==1||b==1||c==1||root==tar){
            return 1;
        }
        return 0;
    }
}
