#include <jni.h>
#include <string>
#include "TbMsg.h"
extern "C"
JNIEXPORT jstring

JNICALL
Java_tb_com_tbndktestmultilib_MainActivity_stringFromJNILibOne(
        JNIEnv *env,
        jobject /* this */) {
    TbMsg tbMsg;
    std:: string msg;
    tbMsg.GetMsg(msg);
    return env->NewStringUTF(msg.c_str());
}
