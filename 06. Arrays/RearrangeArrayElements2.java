import java.util.ArrayList;

public class RearrangeArrayElements2 {
    public static int[] rearrange(int[] nums){
        int l=nums.length;
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();

        for(int i=0;i<l;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }

        int i=0;
        int p=0;
        int n=0;

        while(p<pos.size() && n<neg.size()){
            nums[i]=pos.get(p);
            p++;
            i++;

            nums[i]=neg.get(n);
            n++;
            i++;
        }


        //remaining positive elements
        while(p<pos.size()){
            nums[i]=pos.get(p);
            p++;
            i++;
        }

        //remaining negative elements
        while(n<neg.size()){
            nums[i]=neg.get(n);
            n++;
            i++;
        }

        return nums;
    }


    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] ans=rearrange(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
