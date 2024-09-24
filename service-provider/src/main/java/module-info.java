module com.example.provider {
	exports com.example.provider;
	provides com.example.provider.MyService with com.example.provider.MyServiceImpl;
}