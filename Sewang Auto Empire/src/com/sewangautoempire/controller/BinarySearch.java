package com.sewangautoempire.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.sewangautoempire.model.Model;
import com.sewangautoempire.utils.StringUtil;
import java.util.ArrayList;

/**
 *
 * @author kargo
 */
public class BinarySearch {
    /**
     * Performs a binary search on the given sortedArrayList based on the fieldName to find the searchValue.
     * If the searchValue is found, the corresponding Model object is added to the foundValues ArrayList.
     *
     * @param sortedArrayList The ArrayList of Model objects to be searched, which is assumed to be sorted.
     * @param foundValues     The ArrayList where the found Model objects will be stored.
     * @param searchValue     The value to be searched for in the sortedArrayList.
     * @param begining        The starting index for the search in the sortedArrayList.
     * @param ending          The ending index for the search in the sortedArrayList.
     * @param fieldName       The field name based on which the search will be conducted (e.g., "CarID", "Class", "Model").
     */
    public void binarySearch(ArrayList<Model> sortedArrayList, ArrayList<Model> foundValues,
            String searchValue, int begining, int ending, String fieldName) {
        int numberOfFoundValues = 0;
        if (ending >= begining) {
            System.out.println(ending);
            System.out.println(begining);
            int mid = (begining + ending) / 2;
            String midValue = "";
            if (fieldName == "CarID") {
                midValue = sortedArrayList.get(mid).getCarID();
            } else if (fieldName == "Class") {
                midValue = sortedArrayList.get(mid).getClassID();
            } else if (fieldName == "Model") {
                midValue = sortedArrayList.get(mid).getModel();
            }           
            if ((searchValue.compareTo(midValue)) > 0) {
                //System.out.println("Right");
                binarySearch(sortedArrayList, foundValues, searchValue, mid + 1, ending, fieldName);
            } else if ((searchValue.compareTo(midValue) < 0)) {
                //System.out.println("Left");
                binarySearch(sortedArrayList, foundValues, searchValue, begining, mid - 1, fieldName);
            }
            else {
                //System.out.println("Found");
                numberOfFoundValues ++;
                foundValues.add(sortedArrayList.get(mid));
                binarySearch(sortedArrayList, foundValues, searchValue, mid + 1, ending, fieldName);
                binarySearch(sortedArrayList, foundValues, searchValue, begining, mid - 1, fieldName);
            }
        } else {
            System.out.println(StringUtil.BEGINING_GREATER);
        } 
    }
}