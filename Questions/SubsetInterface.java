package Questions;


import java.util.*;

class printSubset {
    public static void findSubsets(List<List<Integer>> subset , ArrayList<Integer> nums , ArrayList<Integer> output , int index){
        if(index == nums.size()){
            subset.add(output);
            return;
        }

        findSubsets(subset , nums , new ArrayList<>(output) , index+1);
        output.add(nums.get(index));
        findSubsets(subset , nums , new ArrayList<>(output) , index+1);
    }


    public static void main(String[] args) {
        List<List<Integer>> subset = new ArrayList<>();

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);input.add(2);input.add(3);
//        ;input.add(4);input.add(5);


        findSubsets(subset, input, new ArrayList<>(), 0);

        for(int i = 0; i < subset.size(); i++){
            for(int j = 0; j < subset.get(i).size(); j++){
                System.out.print(subset.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}

