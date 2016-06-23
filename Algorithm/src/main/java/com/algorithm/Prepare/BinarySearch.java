package com.algorithm.Prepare;

import java.util.Comparator;
public class BinarySearch<T extends Comparable<T>>{

	public T binarySearch(T key, T[] arrays){
		int lo = 0;
		int li = arrays.length-1;
		while(lo<=li){
			int mid = lo+(li-lo)/2;
			if(arrays[mid].compareTo(key)<0){
				lo=mid+1;
			}else if(arrays[mid].compareTo(key)>0){
				li=mid-1;
			}else{
				return arrays[mid];
			}
		}
		return null;
	}
}

