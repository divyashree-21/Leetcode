int strStr(char* haystack, char* needle) {
	int i,j,n,m,k,c,res=0;
	n=strlen(haystack);
	m=strlen(needle);
	for(i=0;i<=n-m;i++){
		k=i;
		c=0;
		for(j=0;j<m;j++){
			if(haystack[k]==needle[j]){
				k++;
				c++;
			}
			else{
				break;
			}
		}
		if(c==m){
			return i;
		}
		
	}
	return -1;
}