package com.ict.edu03;
//언어대 언어대로 할때 써요. 
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataInputStream 과 DataOutputStream
//기본 자료형을 주고 받을 때 사용
// 반드시 입력순서와 출력 순서를 맞춰야 한다.
//기본 생성자가 없음. BufferedInputStream 과 BufferedOutputStream 처럼 
//혼자서는 사용 못함.
// 보통 FileInputStream, FileOutputStream 을 활용 한다.

public class Ex01 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "Util" + File.separator + "io04.txt"; // 무조건
																													// 확장자적어줘!
		File file = new File(pathname);

		// 쓰는걸 먼저해야겠죠? 그래야 써진걸 읽지

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);

			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);

			// 쓰기 writeXXX() : XXX란 기본자료형을 말한다.
			dos.writeByte(126);
			dos.writeShort(5422);
			dos.writeInt(124);
			dos.writeLong(123L);
			dos.writeFloat(34.14f);
			dos.writeDouble(57.1);
			dos.writeBoolean(true);
			dos.writeChar('f');
			dos.flush();
			
			
			//파일로 봤을땐 못읽었어요. 
			
			//읽기 :readXXX : XXX란 기본자료형을 말한다.
			//만약 순서를 틀린다면 값이 달라져요.
			
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				if (dos != null)
					dos.close();
				if (fos != null)
					fos.close();
				if (dis != null)
					dis.close();
				if (fis != null)
					fis.close();

			} catch (Exception e) {
				// TODO: handle exception
			} finally {

			}

		}

	}
}
