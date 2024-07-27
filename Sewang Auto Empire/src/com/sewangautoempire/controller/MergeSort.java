/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sewangautoempire.controller;

import com.sewangautoempire.model.Model;
import java.util.ArrayList;


/**
 *
 * @author kargo
 */
public class MergeSort {
    /**
    * Sorts an ArrayList of Model objects using the merge sort algorithm based on a specified field to sort by.
    *
    * @param arraylist The ArrayList of Model objects to be sorted.
    * @param sortBy    The field by which the ArrayList should be sorted.
    * @return The sorted ArrayList of Model objects.
    */
    public ArrayList<Model> mergeSort( ArrayList<Model> arraylist, String sortBy){
        if (arraylist.size() <= 1)
        {
            return arraylist;
        }
        int mid = arraylist.size()/2;
        ArrayList<Model> l = new ArrayList<>(arraylist.subList(0, mid));
        ArrayList<Model> r = new ArrayList<>(arraylist.subList(mid, arraylist.size()));
        l = mergeSort(l,sortBy);
        r = mergeSort(r,sortBy);
        return merge(l,r,sortBy);

    }
    
    /**
    * Merges two ArrayLists of Model objects into a single sorted ArrayList based on the specified field.
    *
    * @param l      The left ArrayList of Model objects to be merged.
    * @param r      The right ArrayList of Model objects to be merged.
    * @param sortBy The field by which the ArrayList should be sorted.
    * @return The merged and sorted ArrayList of Model objects.
    */
    private ArrayList<Model> merge(ArrayList<Model> l,ArrayList<Model> r,String sortBy){
        ArrayList<Model> result = new ArrayList<>();
        int lIndex=0;
        int rIndex=0;
        int value=0;

        while (lIndex<l.size() && rIndex<r.size()){
            if (sortBy == "CarID"){
                value = l.get(lIndex).getCarID().compareTo(r.get(rIndex).getCarID());
            }
            else if (sortBy=="Price"){
                value = (l.get(lIndex).getPrice())-(r.get(rIndex).getPrice());
            }
            else if (sortBy == "Make Year"){
               value = (l.get(lIndex).getMakeYear())-(r.get(rIndex).getMakeYear()); 
            }
            else if (sortBy == "Model"){
                value = (l.get(lIndex).getModel()).compareTo(r.get(rIndex).getModel()); 
            }
            else if (sortBy == "Class"){
                value = (l.get(lIndex).getClassID()).compareTo(r.get(rIndex).getClassID()); 
            }
            else if(sortBy =="SN"){
                value = (l.get(lIndex).getSn())-(r.get(rIndex).getSn());
            }
            else if(sortBy == "Body Style"){
                value = (l.get(lIndex).getBodyStyle()).compareTo(r.get(rIndex).getBodyStyle()); 
            }
            
            if (value < 0) {
                    result.add(l.get(lIndex));
                    lIndex++;
                }
            else{
                    result.add(r.get(rIndex));
                    rIndex++;
                }
        }
        result.addAll(l.subList(lIndex, l.size()));
        result.addAll(r.subList(rIndex, r.size()));
        return result;

    }
}

    

