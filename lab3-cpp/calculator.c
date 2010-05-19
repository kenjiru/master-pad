/*
 * calculator.c
 *
 *  Created on: May 19, 2010
 *      Author: radu
 */

#include "calculator.h"
#include <malloc.h>
#include <string.h>
#include <math.h>

JNIEXPORT jlong JNICALL Java_app_Calculator_aduna
  (JNIEnv *env, jobject obj, jlong a, jlong b)
{
	return a + b;
}

JNIEXPORT jlong JNICALL Java_app_Calculator_scade
  (JNIEnv *env, jobject obj, jlong a, jlong b)
{
	return a - b;
}

JNIEXPORT jlong JNICALL Java_app_Calculator_inmulteste
  (JNIEnv *env, jobject obj, jlong a, jlong b)
{
	return a * b;
}

JNIEXPORT jlong JNICALL Java_app_Calculator_imparte
  (JNIEnv *env, jobject obj, jlong a, jlong b)
{
	return a / b;
}

JNIEXPORT jstring JNICALL Java_app_Calculator_baza2
  (JNIEnv *env, jobject obj, jint a)
{
	char *str = (char*) malloc(sizeof(char) * 100), t;
	int i = 0, j, r;

	while (a > 0) {
		r = a % 2;
		str[i++] = '0' + r;
		a = a / 2;
	}
	str[i] = 0;

	// inversez sirul
	j = 0;
	while (j < i / 2) {
		t = str[j];
		str[j] = str[i-j-1];
		str[i-j-1] = t;
		j++;
	}

	return (*env)->NewStringUTF(env, str);
}

JNIEXPORT jint JNICALL Java_app_Calculator_baza10
  (JNIEnv *env, jobject obj, jstring string)
{
	const char* str = (*env)->GetStringUTFChars (env, string, 0);
	int n = 0, i = 0, l = strlen(str);

	while (i < l) {
		n += (str[i] - '0') * pow(2,l-i-1);
		i++;
	}

	return n;
}

int main(int argc, char **argv) {
	return 0;
}
