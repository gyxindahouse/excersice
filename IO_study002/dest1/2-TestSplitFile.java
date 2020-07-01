essFile(this.src, "r");
		RandomAccessFile raf2 = new RandomAccessFile(this.destPaths.get(i), "rw");
		raf.seek(beginPos);
		
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=raf.read(flush))!=-1){
			if(actualSize>len){
				raf2.write(flush, 0, len);
				actualSize -= len;
			}else{
				raf2.write(flush, 0, actualSize);
				break;
			}
		}
		raf2.close();
		raf.close();
	}
	/**
	 * 文件的合并
	 * @throws IOException 
	 */
	public void merge(String destPath) throws IOException{
		//输出流
		OutputStream os = new BufferedOutputStream(new FileOutputStream(destPath,true));
		Vector<InputStream> vi = new Vector<InputStream>();
		SequenceInputStream sis = null;
		//输入流
		for(int i=0;i<destPaths.size();i++){
			vi.add(new BufferedInputStream(new FileInputStream(destPaths.get(i))));
		}
		sis = new SequenceInputStream(vi.elements());
		
		byte[] flush = new byte[1024];
		int len = -1;
		while((len=sis.read(flush))!=-1){
			os.write(flush, 0, len);
		}
