close();
		
	}
	public static void main(String[] args) throws IOException {
		TestSplitFile tsf = new TestSplitFile("src/com/gyx/io/TestSplitFile.java", "dest");
		tsf.split();
		tsf.merge("aaa.java");
	}
}
