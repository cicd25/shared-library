package com.devops.jenkins.demo


def jsonContentParse(def fileNamewithExt) {

	def content = libraryResource encoding: 'UTF-8', resource: "$fileNameWithExt"
	println "content : $content"	
	return content

}

