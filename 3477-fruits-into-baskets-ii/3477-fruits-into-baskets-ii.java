class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int unplaced = 0;
        for(int fru=0; fru<n; fru++){   // ye i ko repesent karta hai(fruite)
            boolean place = false;
            for(int bas=0; bas<n; bas++){    // ye j ko repesent karta hai(baskets)
                if(baskets[bas] >= fruits[fru]){    // bas >= fru se
                    baskets[bas] = 0;
                    place = true;
                    break;
                }
            }
            if(!place){
                unplaced++;
            }
        }
        return unplaced;
    }
}