public void Print node_DS()
{
node temp = l;
if(l==Null)
System.out.print("list is empty");
else{
while(temp!=NULL){
System.out.print(temp.data);
temp=temp.next;
}
}