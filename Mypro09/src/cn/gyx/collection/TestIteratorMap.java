package cn.gyx.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ���Ե���������map
 * 
 * @author ����
 *
 */
public class TestIteratorMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "gyx");
		map.put("B", "gyx1");
		//����һ
		Set<Entry<String, String>> ss = map.entrySet();//ͨ��entrySet()������map�����е�ӳ���ϵȡ���������ϵ����Map.Entry���ͣ�
		for (Iterator<Entry<String, String>> iterator = ss.iterator(); iterator.hasNext();) {
			Entry<String, String> e = iterator.next();//��ȡMap.Entry��ϵ����e
			System.out.println(e.getKey() + "--" + e.getValue());
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//������,Ҳ����ͨ��map��keySet()��valueSet()���key��value�ļ��ϣ��Ӷ���������
		Set<String> ss1 = map.keySet();//�Ȼ�ȡmap���ϵ����м���Set����
		for(Iterator<String> iterator = ss1.iterator(); iterator.hasNext();){
			String key = iterator.next();
			System.out.println(key+"--"+map.get(key));//����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ��
		}
	}
}
