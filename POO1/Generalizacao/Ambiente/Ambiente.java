package Ambiente;

public class Ambiente {

		
		private float area;
		
		
		public Ambiente(float area) {
			setArea(area);
		}

		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Ambiente Área: ");
			builder.append(area);
			builder.append(" ");
			return builder.toString();
		}
		

}
