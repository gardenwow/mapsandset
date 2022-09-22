package com.examplesermapss.setmaps;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SetMapService {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4,1, 5,6, 67,123,556,223,56,79,1, 5, 6, 7));
    List<String> strings = new ArrayList<>(List.of("ale", "ale","Lex","vasya", "ale", "privet", "hello", "Lex"));

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SetMapService that)) return false;
        return Objects.equals(nums, that.nums) && Objects.equals(strings, that.strings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nums, strings);
    }

    public List<Integer> oddNumber() {
        List<Integer> oddNumbers = new ArrayList<>(nums);
        for (int i = 0; i < oddNumbers.size(); i++) {
            if (oddNumbers.get(i) % 2 ==0){
                oddNumbers.remove(i);
                i--;
            }
        }
        return oddNumbers;
    }
    public SortedSet<Integer> evenNumber() {
        List<Integer> evenNumbers = new ArrayList<>(nums);
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (!(evenNumbers.get(i) % 2 == 0)) {
                evenNumbers.remove(i);
                i--;
            }
        }
        SortedSet<Integer> odd = new TreeSet<>(evenNumbers);
        return odd;
    }
    public Set<String> dublicate(){
        Set<String> dublicate = new HashSet<>(strings);
        return dublicate;

    }
    public Integer numberDubl(){
        Set<String> numbere = new HashSet<>(strings);
        return (strings.size()-numbere.size());
    }
}
