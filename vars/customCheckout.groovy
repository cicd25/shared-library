def call(Map map) {

	try {
	logInfo("customCheckout function call.....")

		if(map == null) {
		   throw new Exception("input values are empty!")	
		}

		ws(map.workspace) {
		   git url: map.url
		}

	} catch(e) {
          logError("${e}")
	}

}
