#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/LLVMContext.h"

using namespace llvm;

LLVMContext context;
Module* module = new Module("CommandModule", context);
IRBuilder<> builder(context);

// Define the structure for Command
StructType* commandType = StructType::create(context, "Command");
commandType->setBody({builder.getInt32Ty(), builder.getInt8PtrTy()});

// Define the structure for CommandList
StructType* commandListType = StructType::create(context, "CommandList");
commandListType->setBody({PointerType::get(commandType, 0), builder.getInt32Ty()});

// Create global variable to store the command list
GlobalVariable* commandList = new GlobalVariable(
    *module,
    commandListType,
    false,
    GlobalValue::ExternalLinkage,
    Constant::getNullValue(commandListType),
    "commandList"
);

// Function to add commands (this can be more complex based on your needs)
FunctionType* addCommandType = FunctionType::get(builder.getVoidTy(), {builder.getInt32Ty(), builder.getInt8PtrTy()}, false);
Function* addCommand = Function::Create(addCommandType, Function::ExternalLinkage, "addCommand", module);

// Function body (just a stub for example purposes)
BasicBlock* entry = BasicBlock::Create(context, "entry", addCommand);
builder.SetInsertPoint(entry);
builder.CreateRetVoid();