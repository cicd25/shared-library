def call(int x, int y) {

    	def addition = new com.devops.jenkins.demo.Addition()
    	def sum = addition.add(x,y)

	println("sum of the two variables is : $sum")
		
	return sum
}
