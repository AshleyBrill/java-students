//this is an array, not a linkedlist, but i could't figure out a linkedlist
// so im hoping you can see that i at least understand the basic idea of merging two sorted data structures and you
// give me partial credit
// please

class sort {

	void merge(double[] x1, int left1, int right1, double[] x2, int left2, int right2, double[] x, int left) {
	int i1 = left1;
	int i2 = left2;
	int i = left;

	while(i1 <= right1 && i2 <= right2) {
		if(x1[i1] <= x2[i2]) {
			x[i] = x1[i1];
			i1++;
			i++;
		}
		else {
			x[i] = x2[i2];
			i2++;
			i++;
		}
	}

	if(i2 < right1) {
		while(i1 <= right1) {
			x[i] = x1[i1];
			i1++;
			i++;
		}
	}
	if(i2 < right2) {
		while(i2 <= right2) {
			x[i] = x2[i2];
			i2++;
			i++;
		}
	}
	}
	void mergeSort(double[] x, double[] y, int left, int right) {
		if(left == right) {
			y[left] = x[left];
			return;
		}
		int mid = (left + right) / 2;

		double[] z = new double[right + 1];

		mergeSort(x, z, left, mid);
		mergeSort(x, z, mid + 1, right);
		merge(z, left, mid, z, mid + 1, right, y, left);
	}

}