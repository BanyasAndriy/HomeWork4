package HomeWork3;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {

	private Student[] studs ;
	private int sizeOfGroup;
	private String name;
	
	public Group(String name , int sizeOfGroup) {
		this.name = name;
		this.sizeOfGroup = sizeOfGroup;
	   studs = new Student[sizeOfGroup];
	}
	
	public Group() {
		this.name = "group";
		this.sizeOfGroup = 10;
		studs=new Student[sizeOfGroup];
	}
	
	
	public int getSizeOfGroup() {
		return sizeOfGroup;
	}

	public void setSizeOfGroup(int sizeOfGroup) {
		this.sizeOfGroup = sizeOfGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void addStudents(Student stud){
	   int counter=0;
		
		for (int i = 0; i < this.studs.length; i++) {
			if(studs[i]==null) {
				studs[i]=stud;
				System.out.println("C������ " + stud.getLastName() + " " + stud.getName() + " ������� � ����� " + this.getName() + "!");
				break;
			}else {
				counter++;
			}
			
		}
		if(counter==this.sizeOfGroup) {
			throw new ExceptionOfGroup();
		}
	
		
	}
	
	
	
	
	public void interactiveAddingObject() {
		
		String name;
		String lastName ;
		String surName ;
		int age;
		String nameOfUniversity;
		String faculty;
		int course;
		String group;
		
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("������ ����� ������������ : ");
		    nameOfUniversity=scan.nextLine();
		    
		System.out.println("������ ��� ��������: ");
		name= scan.nextLine();
		
		System.out.println("������ ������� ��������: ");
	    lastName=scan.nextLine();
	    
	    System.out.println("������ ��-������� �������� : ");
	    surName=scan.nextLine();
	    
	    System.out.println("������ �� �������� ");
	    age=scan.nextInt();
	    
	   
	    System.out.println("������ ��������� : ");
	    faculty=sc.nextLine();
	    
	    System.out.println("������ ���� :");
	    course=scan.nextInt();
	    
	    System.out.println("������ ����� :");
	    group=sc.nextLine();
	    
	    
		
		
		
		Student stud = new Student(name,lastName,surName,age,nameOfUniversity,faculty,course,group);
				
		
		addStudents(stud);
		
		
	}
	
	
	
	public void deleteStudents(Student stud) {
		
		for (int i = 0; i < studs.length; i++) {
		if(studs[i]!=null) {
			if(studs[i].equals(stud)) {
				studs[i]=null;
				System.out.println("������� " + stud.getLastName() + " " + stud.getName() + " ��������� � �����!");
				break;
			}
		}
		}
	
	}
	
	public Student searchStudent(String lastName){
		Student stud=null;
		for (int i = 0; i < studs.length; i++) {
		
			if(studs[i]!=null) {
				if(studs[i].getLastName().equals(lastName)) {
					stud=studs[i];
					break;
				}	
			}
		}
		
		
		return stud;
	}
	

	
	@Override
	public String toString() {
	
		System.out.println(" ����� : " + this.getName());
	
		
		 for(int i = 0; i<studs.length; i++) {
	         for (int j = i+1; j<studs.length; j++) {
	          
	        	 if(studs[i]!=null && studs[j]!=null) {
	        	 if(studs[i].getLastName().compareTo((studs[j].getLastName()))>0) {
	               Student temp = studs[i];
	               studs[i] = studs[j];
	               studs[j] = temp;
	            }
	         }
	      }
		 
		 }
		 
	   
	int count=1;
		 for (int i = 0; i < studs.length; i++) {
			 if(studs[i]!=null) {
			 System.out.println( count + ")" + "ϲ�: " + studs[i].getLastName()+" " + studs[i].getName() + " " +studs[i].getSurName()  +  "\n ³�:" + studs[i].getAge() + " \n ���������: " + studs[i].getFaculty() + "\n�����������: " + studs[i].getNameOfUniversity()+ " \n �����: " + studs[i].getGroup());
		count++;
			 }}
		 
		 
		return ".";
		
		
	}
	
	
	
public void sortByParametr() {
	
	int parametr;
	Scanner scan = new Scanner(System.in);
	System.out.println("������ 1 - ��� ���������� �� ������ \n 2 - ��� ���������� �� �������� \n 3 - ��� ���������� �� ���� ");
	parametr=scan.nextInt();
	
	
	switch (parametr) {
	case 1:
		sortByName();
		break;
    
	case 2 :
		toString();
		break;
		
	case 3:
		sortByAge();
		break;
			
		
	}
	
	
	}


	
	public void sortStudentsByLastName() {
	System.out.println("���������� �� �������: ");
	toString();	
		
	}
			

	
	
		
	
    public void sortByName() {
    	System.out.println("C��������� �� ����� ");
    	 for(int i = 0; i<studs.length; i++) {
	         for (int j = i+1; j<studs.length; j++) {
	          
	        	 if(studs[i]!=null && studs[j]!=null) {
	        	 if(studs[i].getName().compareTo((studs[j].getName()))>0) {
	               Student temp = studs[i];
	               studs[i] = studs[j];
	               studs[j] = temp;
	            }
	         }
	      }
		 
		 }
		 
	   
	int count=1;
		 for (int i = 0; i < studs.length; i++) {
			 if(studs[i]!=null) {
			 System.out.println( count + ")" + "ϲ�: " + studs[i].getName()+" " + studs[i].getLastName() + " " +studs[i].getSurName()  +  "\n ³�:" + studs[i].getAge() + " \n ���������: " + studs[i].getFaculty() + "\n�����������: " + studs[i].getNameOfUniversity()+ " \n �����: " + studs[i].getGroup());
		count++;
			 }}
		 	
    	
    	
    }

    public void sortByAge() {
    	
    	System.out.println("C��������� �� ��� ");
      	 
    	
    	
    	
    	for(int i = 0; i<studs.length; i++) {
	         for (int j = i+1; j<studs.length; j++) {
	          
	        	 if(studs[i]!=null && studs[j]!=null) {
	        	 if(studs[i].getAge()>studs[j].getAge()) {
	               Student temp = studs[i];
	               studs[i] = studs[j];
	               studs[j] = temp;
	            }
	         }
	      }
		 
		 }
		 
	   
	int count=1;
		 for (int i = 0; i < studs.length; i++) {
			 if(studs[i]!=null) {
			 System.out.println( count + ")" + "ϲ�: " + studs[i].getName()+" " + studs[i].getLastName() + " " +studs[i].getSurName()  +  "\n ³�:" + studs[i].getAge() + " \n ���������: " + studs[i].getFaculty() + "\n�����������: " + studs[i].getNameOfUniversity()+ " \n �����: " + studs[i].getGroup());
		count++;
			 }}
		 	
    
    	
    }

	@Override
	public Student[] getStudentsToVoenkom() {
		
		System.out.println("�������� ,���� ������� ������� ���������!");
		int count=0;
	/*	for (int i = 0; i < studs.length; i++) {
			if(studs[i]!=null) {
			
			if(studs[i].getAge()>18) {	
				count++;
			}
			
		}}*/

		Student[] studToVoenkom = new Student[this.sizeOfGroup];
		int pos=0;
		for (int i = 0; i < studToVoenkom.length; i++) {
			if(studs[i]!=null) {
			
			if(studs[i].getAge()>18) {	
				studToVoenkom[pos]=studs[i];
				pos++;
			}
			
			
		}}	
		
		return studToVoenkom;
		
	}

    
   
	
	
	
}