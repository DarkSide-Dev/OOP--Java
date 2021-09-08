
public class Human {
	
	String name;
	String sex;
	int skill = 0;
	int age;
	double weight;
	boolean isWorking = false;

	Human(String name, int age, String sex, double weight){
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		
	}
	
	void eat() {
		
		System.out.printf("\n%s is eating *nham nham*\n", this.name);
		
	}
	
	void birthday() {
		
		this.age += 1;
		System.out.printf("\nHappy Birthday to you %s!!\nNow you're %d years old *clap clap*\n", this.name, this.age);
		
	}
	
	void study() {
		
		this.skill += 1;
		System.out.printf("\nStudying hard!! +1 point (Total: %d)\n", this.skill);
		
	}
	
	void jobSearching() {
		
		if(this.isWorking) {
			
			System.out.printf("\nSorry, you already have a job!!\n");
			
		}
		else if(this.skill >= 5) {
			
			System.out.printf("\nCongrats!! You've enough skills, and because this, now you're hired!!\n");
			this.isWorking = true;
			
		}
		else {
			
			System.out.printf("\nSorry, you don't have enough skills, study more!!\n");
			
		}
		
	}
	
}
