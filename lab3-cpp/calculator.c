/*
 * calculator.c
 *
 *  Created on: May 19, 2010
 *      Author: radu
 */

#include "calculator.h"

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

int main(int argc, char **argv) {
	return 0;
}
