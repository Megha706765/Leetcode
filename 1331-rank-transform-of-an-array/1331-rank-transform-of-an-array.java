class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        //map = {40,10,30,30}
        //copy = {10,20,30,40}
        //map : {}
        for(int i=0; i<copy.length; i++){
            if(map.containsKey(copy[i]) == false){
                map.put(copy[i], rank++);
            }
        } 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}