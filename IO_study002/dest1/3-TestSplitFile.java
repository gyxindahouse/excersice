		os.flush();
		sis.close();
		os.close();
		
	}
	public static void main(String[] args) throws IOException {
		TestSplitFile tsf = new TestSplitFile("src/com/gyx/io/TestSplitFile.java", "dest1");
		tsf.split();
		tsf.merge("aaa.java");
	}
}
