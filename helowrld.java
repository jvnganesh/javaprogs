class helowrld{
    public static void main(String[] args){
        Student[] arr;
        arr = new Student[2];
        arr[0]=new Student(4,"ganesh");
        arr[1]=new Student(1,"uber");
        System.out.println("student info at 1");
        arr[0].display();
        arr[1].display();
        
    }
}
//https://www.geeksforgeeks.org/how-to-create-array-of-objects-in-java/
class Student{
    public int id;
    public String name;

    Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("Student id is: "+id+" and name is: "+name);
        System.out.println();
    }
}