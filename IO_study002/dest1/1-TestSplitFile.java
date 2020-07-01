this.blockSize = blockSize;
		
		init();//初始化
	}

	private void init() {
		long len = this.src.length();
		this.size=(int)Math.ceil(len*1.0/blockSize);
		for(int i=0;i<size;i++){
			this.destPaths.add(this.destDir+"/"+i+"-"+this.src.getName());
		}
	}
	/**
	 * 分割
	 * 1、计算每一块的起始位置及其大小 2、分割
	 * @throws IOException 
	 */
	public void split() throws IOException{
		long len = src.length();
		int beginPos = 0;
		int actualSize = (int)(blockSize>len?len:blockSize);
		for(int i = 0; i<size;i++){
			beginPos = i*blockSize;
			if(i==size-1){
				actualSize = (int)len;
			}else{
				actualSize = blockSize;
				len -= actualSize;
			}
			splitDetail(i,beginPos,actualSize);
		}
	}
	/**
	 * 指定第i块的起始位置 和实际长度
	 * @param i
	 * @param beginPos
	 * @param actualSize
	 * @throws IOException 
	 */
	private void splitDetail(int i, int beginPos, int actualSize) throws IOException {
		RandomAccessFile raf = new RandomAcc