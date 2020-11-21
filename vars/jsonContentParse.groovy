def call(def fileNameWithExt) {

	def jsonObj = new com.devops.jenkins.demo.SampleJsonParser()
	def content = jsonObj.jsonContentParse(fileNameWithExt)

	println("-----------------------------------")
	println("content : $content")


}

