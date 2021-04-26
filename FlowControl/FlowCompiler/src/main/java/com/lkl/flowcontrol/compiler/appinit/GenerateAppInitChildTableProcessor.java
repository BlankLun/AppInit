package com.lkl.flowcontrol.compiler.appinit;

import com.lkl.flowcontrol.common.ModuleConsts;
import com.lkl.flowcontrol.common.appinit.AppInit;
import com.lkl.flowcontrol.compiler.BaseGenerateChildTableProcessor;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;

import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/**
 * 作者:王浩
 * 创建时间:2018/1/18
 * 描述:生成 AppInit 字表
 */
@SupportedOptions({ModuleConsts.APT_MODULE_COORDINATE_KEY, ModuleConsts.APT_DEPENDENCIES_KEY})
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class GenerateAppInitChildTableProcessor extends BaseGenerateChildTableProcessor {

    @Override
    protected String getAptModuleCoordinateKey() {
        return ModuleConsts.APT_MODULE_COORDINATE_KEY;
    }

    @Override
    protected String getAptModuleDependenciesKey() {
        return ModuleConsts.APT_DEPENDENCIES_KEY;
    }

    @Override
    protected Class getAnnotationClass() {
        return AppInit.class;
    }

    @Override
    protected boolean validateChildAnnotatedElement(Element annotatedElement, String annotationSimpleName) {
        return validateClassImplements(annotatedElement, ModuleConsts.APP_INIT_INTERFACE, annotationSimpleName);
    }

    @Override
    protected void insertStatementBeforeAddItem(MethodSpec.Builder constructorMethod) {
        constructorMethod.addParameter(int.class, "priority");
        constructorMethod.addStatement("this.priority = priority");

        constructorMethod.addStatement("setCoordinate($S)", mModuleCoordinate);
        constructorMethod.addStatement("setDependencies($S)", mModuleDependencies);
    }

    @Override
    protected void addItem(TypeElement element, MethodSpec.Builder constructorMethod) {
        AppInit appInit = element.getAnnotation(AppInit.class);
        constructorMethod.addStatement("add(new $T($S, $L, $L, $S, $S, $S, $S, $S))",
                getTypeName(ModuleConsts.APP_INIT_ITEM_CANONICAL_NAME),
                element.getQualifiedName().toString(),
                appInit.process().ordinal(),
                appInit.priority(),
                mModuleCoordinate + ":" + element.getSimpleName(),
                appInit.aheadOf(),
                appInit.description(),
                String.valueOf(appInit.onlyForDebug()),
                mModuleCoordinate
        );
    }

    @Override
    protected String getChildTableSuffix() {
        return ModuleConsts.CHILD_INIT_TABLE_SUFFIX;
    }

    @Override
    protected TypeName getChildTableSuperClassTypeName() {
        return getTypeName(ModuleConsts.CHILD_INIT_TABLE_CANONICAL_NAME);
    }

    @Override
    protected String getGeneratedPackageName() {
        return ModuleConsts.PACKAGE_NAME_GENERATED;
    }
}
