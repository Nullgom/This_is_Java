package sec08.exam04_method_overloading;

// �޼ҵ� �����ε�
public class Calculator {

	// ��������� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	// ���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
