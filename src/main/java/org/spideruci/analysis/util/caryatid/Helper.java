package org.spideruci.analysis.util.caryatid;

import static com.google.common.base.Preconditions.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Stack;


public class Helper {
	
	public static String joinStrings(String seperator, Object ... strings) {
		int length = strings.length;
		StringBuffer buffer = new StringBuffer();
		if(length == 0) {
			return "";
		}
		
		buffer.append(strings[0] == null? null : strings[0].toString());
		for(int i = 1; i<length; i++) {
			buffer.append(seperator);
			buffer.append(strings[i] == null? null : strings[i].toString());
		}
		return buffer.toString();
	}
	
	public static <T> T checkEquals(T object, T against) {
		return checkEquals(object, against);
	}
	
	public static <T> T checkEquals(T object, T against, String errorMessage) {
		if(!object.equals(against)) {
			throw new RuntimeException(errorMessage);
		}
		return object;
	}
	
	public static int getArgCount(String methodName, boolean isStatic) {
		int beginIndex = methodName.indexOf('(') + 1;
		int endIndex = methodName.lastIndexOf(')');
		String desc = methodName.substring(beginIndex, endIndex);
		return argInitialsFromDesc(desc, isStatic).length;
	}
	
	public static char[] getArgInitials(String methodName, boolean isStatic) {
		int beginIndex = methodName.indexOf('(') + 1;
		int endIndex = methodName.lastIndexOf(')');
		String desc = methodName.substring(beginIndex, endIndex);
		return argInitialsFromDesc(desc, isStatic);
	}
	
  	private static char[] argInitialsFromDesc(String desc, boolean isStatic) {
  		String x1 = desc.replace("[", "");
  		String x2 = x1.replace(";", "; ");
  		String x3 = x2.replaceAll("L\\S+;", "L");
  		String x4 = x3.replace(" ", "");
  		if(!isStatic) {
  		  return ("L" + x4).toCharArray();
  		}
  		return x4.toCharArray();
  	}
	
	public static boolean isArgPrimitive(char argInitial) {
	  if(Character.toUpperCase(argInitial) == 'L') {
	    return false;
	  }
	  return true;
	}
	
	public static void grep(String exact, File file, File output) {
		
		String grep_cmd = 
				"grep -m 1" + exact.replaceAll("\\$", "\\$") 
				+ " " + file.getAbsolutePath() + " > " + output.getAbsolutePath();
		try {
			Process p = Runtime.getRuntime().exec(new String[]{"bash","-c", grep_cmd});
			System.out.println(p.waitFor());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static class Collections2 {
	  @SuppressWarnings("rawtypes")
    static private ArrayList emptyArrayList = new ArrayList();
	  @SuppressWarnings("unchecked")
    public static <T> ArrayList<T> emptyArrayList() {
	    return emptyArrayList;
	  }

	  public static <T> LinkedHashSet<T> emptyLinkedHashSet() {
	    return (LinkedHashSet<T>) Collections.<T>emptySet();
	  }

	  public static <K, V> HashMap<K, V> emptyHashMap() {
	    return (HashMap<K, V>) Collections.<K, V>emptyMap();
	  }
	  
	  public static <K> ArrayList<K> cloneArrayList(ArrayList<K> list) {
	    ArrayList<K> nList = new ArrayList<>();
	    for(K item : list) {
	      nList.add(item);
	    }
	    return nList;
	  }
	  
	  public static <U extends Number> 
	  String stringify(Iterable<U> set, String seperator) {
	    StringBuffer buffer = new StringBuffer();
	    for(U element: set) {
	      buffer.append(element).append(seperator);
	    }
	    return buffer.toString();
	  }
	  
	  public static String stringify2(Iterable<String> set, String seperator) {
      StringBuffer buffer = new StringBuffer();
      for(String element: set) {
        buffer.append(element).append(seperator);
      }
      return buffer.toString();
    }
	  
	  public static <T> String stringify3(Iterable<T> set, String seperator) {
	    StringBuffer buffer = new StringBuffer();
      for(T element: set) {
        buffer.append(element.toString()).append(seperator);
      }
      return buffer.toString();
	  }
	  
	  public static <T> ArrayList<T> pickRandomFraction(ArrayList<T> all, int frac) {
	    ArrayList<T> summaries = new ArrayList<>();
	    int allcount = all.size();
	    float fractionCount = (frac/100.0f) * allcount;
	    if(fractionCount < 0.0f) {
	      return summaries;
	    }

	    int randomSampleSize = (int) Math.floor(fractionCount);
	    
	    long seed = System.nanoTime();
	    Collections.shuffle(all, new Random(seed));
	    Collections.shuffle(all, new Random(seed));
	    
	    for(int i = 0; i < randomSampleSize; i += 1) {
	      summaries.add(all.get(i));
	    }

	    return summaries;
	  }
	  
	  public static <T extends Number> double sum(Collection<T> collection) {
	    double sum = 0;
	    
	    for(T number : collection) {
	      if(number == null) continue;
	      sum += number.doubleValue();
	    }
	    
	    return sum;
	  }
	  
	  public static <T extends Number> double mean(Collection<T> collection) {
	    double sum = 0;
	    int count = 0;
      
      for(T number : collection) {
        if(number == null) continue;
        sum += number.doubleValue();
        count += 1;
      }
      double average = sum / count; 
      return average;
	  }
	  
	  public static <K, V> String toString(Entry<K, V> entry) {
      K key = checkNotNull(entry).getKey();
      V value = entry.getValue();
      
      String toString = checkNotNull(key).toString() + " " + checkNotNull(value).toString();
      
      return toString;
    }
	  
	}
	
	public static class Logger {
		private static boolean isLogging = false;
		public static void log(String logMessage, PrintStream out) {
			if(!isLogging) return;
			out.append(logMessage);
		}
	}

	public static int checkIfStringIsInteger(String s) {
		return Integer.parseInt(s);
	}
}
