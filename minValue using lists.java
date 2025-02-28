
class Solution {
    public long minValue(List<Integer> arr1, List<Integer> arr2) {
        long res=0;
        Collections.sort(arr1);
        Collections.sort(arr2,Collections.reverseOrder());
        for(int i=0;i<arr1.size();i++){
            for(int j=i;j==i;j++){
                res+=(arr1.get(i)*arr2.get(j));
            }
        }
        return res;
    }
}