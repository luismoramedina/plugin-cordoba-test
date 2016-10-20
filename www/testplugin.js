var testplugin = {
	functionTest : function (successCallback,  errorCallback, 
			string1, string2) {
		
		cordova.exec(
			successCallback,
			errorCallback,
			"testplugin",
			"testAction",
			[{
				"string1" : string1,
				"string2": string2
			}]
		);
	}
}
module.exports = testplugin;