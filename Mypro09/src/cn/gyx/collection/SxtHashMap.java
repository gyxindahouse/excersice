package cn.gyx.collection;

/**
 * �Զ���һ��hashmap ʵ��get���������ݼ������ö�Ӧ��ֵ����
 * 
 * @author ����
 *
 */
public class SxtHashMap<K, V> {
	Node3[] table;// λͰ���飬bucket array
	int size;// ��ż�ֵ�Եĸ���

	public SxtHashMap() {
		table = new Node3[16];// ����һ�㶨��Ϊ2��������
	}

	public V get(K key) {
		int hash = myHash(key.hashCode(), table.length);
		V value = null;

		if (table[hash] != null) {
			Node3 temp = table[hash];

			while (temp != null) {
				if (temp.key.equals(key)) {// ��������˵���ҵ��˼�ֵ�ԣ�������Ӧ��value
					value = (V) temp.value;
					break;
				} else {
					temp = temp.next;
				}
			}
		}
		return value;
	}

	public void put(K key, V value) {
		// ��Ҫ��������Ҫ�����������ݵ�����
		// �������µĽڵ����
		Node3 newNode = new Node3();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;

		Node3 temp = table[newNode.hash];

		Node3 iterLast = null;// ���ڱ��������һ��Ԫ��
		boolean keyRepeat = false;
		if (temp == null) {
			// �˴�����Ԫ��Ϊ�գ� ��ֱ�ӽ��½ڵ�Ž�ȥ
			table[newNode.hash] = newNode;
			size++;
		} else {
			// �˴�����Ԫ�ز�Ϊ�գ��������Ӧ����
			while (temp != null) {
				// �ж�key����ظ����򸲸�
				if (temp.key.equals(key)) {
					keyRepeat = true;
					temp.value = value;// ֻ�Ǹ���value���� ������ֵ��hash�� key��next�����ֲ���
					break;
				} else {
					// key���ظ����������һ��
					iterLast = temp;
					temp = temp.next;
				}
			}
			if (!keyRepeat) {// û�з���key�ظ������������ӵ��������
				iterLast.next = newNode;
				size++;
			}
		}
	}

	@Override
	public String toString() {
		// {10��aa�� 20��bb}
		StringBuilder sb = new StringBuilder("{");

		// ����bucket����
		for (int i = 0; i < table.length; i++) {
			Node3 temp = table[i];
			// ��������
			while (temp != null) {
				sb.append(temp.key + ":" + temp.value + ",");
				temp = temp.next;
			}
		}
		sb.setCharAt(sb.length() - 1, '}');
		return sb.toString();
	}

	public static void main(String[] args) {
		SxtHashMap<Integer, String> m = new SxtHashMap<>();
		m.put(10, "aa");
		m.put(20, "bb");

		System.out.println(m.get(20));
	}

	private int myHash(int v, int length) {
		return v & (length - 1);
	}
}
