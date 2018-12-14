
/* 
1.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	c++;
}

for(int j = 0; j < n; j++) {
	c++;
}
/*
2.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	for(int j = 0; j < n - 1; j++) {
		c++;
	}
}


/*
3.
*/

//a ist eine ArrayList<Integer>
int c = 0;
for(int i = 0; i < n; i++) {
	if(a.get(i) != 0) {
		for(int j = 0; j < n; j++) {
			c++;
		}
	}
}


/*
4.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	for(int j = i + 1; j < n; j++) {
		c++;
	}
}

/*
5.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	for(int j = 0; j < i; j++) {
		c++;
	}
}


/*
6.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	for(int j = 0; j < i * i; j++) {
		c++;
	}
}


/*
7.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	for(int j = 0; j < i / 2; j++) {
		c++;
	}
}



/*
8.
*/
int c = 0;
for(int i = 0; i < n; i++) {
	for(int j = 0; j < n; j++) {
		for(int k = 0; k < j; k++) {
			c++;
		}
	}
}


/*
9.
*/
int c = 0;
for(int i = 1; i < n; i *= 2) {
	c++;
}



/*
10.
		best-case		worst-case
f(n)	  O(1)				O(n³)
g(n)	  O(n²)				O(n³)
*/
void method(int[] array) {
	int len = array.length();
	for(int i = 0; i < len; i++) {
		int k = f(len);
		if(array[i] == k) {
			g(len);
		} else {
			g(2);
		}
	}
}

