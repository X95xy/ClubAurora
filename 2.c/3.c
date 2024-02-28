#include<stdio.h>
#include<math.h>
int main( void)
{
int m,q;
int n=0;
int p=0;
int cnt=0;
int t;
printf("请输入一个值。\n");
scanf("%d",&m);
if(m<0) {
	printf("fu");
	m=-m;
}
t=m;
   while(m>0){
   	m=m/10;
   	cnt++;
}
cnt--;
//printf("此时cnt和m的值分别为%-10d%-10d\n",cnt,m);
while(t>9){
	p=pow(10,cnt);
//	printf("%d",p);
	q=t/p;
	p=p/10;
	t=t%p;
//	printf("q和t的值分别为%10d%10d",q,t);
	switch(q) {
case 0:printf("ling");	continue;
case 1:printf("yi");
case 2:printf("er");	continue;
case 3:printf("san");	
case 4:printf("si"); 	
case 5:printf("wu");
case 6:printf("liu");
case 7:printf("qi");
case 8:printf("ba");
case 9:printf("jiu");
}
}
	return 0;
}