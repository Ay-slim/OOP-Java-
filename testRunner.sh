javac -cp ".:lib/*" -d . $1.java
java -cp ".:lib/*" org.junit.runner.JUnitCore $1