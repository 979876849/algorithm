package bubbole;

import java.util.Arrays;

public class MyBubbleSort {
	public static void main(String[] args) {
		int[] arr1 = new int[] {6,3,76,83,5}; // ��ʼ��һ�����鲢��ֵ
		BubbleSort(arr1);	//������Ϊ����д�����򷽷���
		System.out.println(Arrays.toString(arr1));
	}
	//ð�����򷽷�����Ҫ��ͨ���м���ֵ�������ȽϺ�Ĵ�С��������λ��
	//˫��ѭ��������i,j=i+1����ʾ���������ڵ�������
	//tempΪ�м����
	private static int [] BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;		//���ؽ����������
	}
	
	
}
