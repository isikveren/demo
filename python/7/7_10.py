def print_models(unprinted_designs,completed_models):
    #模拟打印每个设计，直到没有未打印的设计为止
    #打印每个设计后，都将其移到列表complete

    while unprinted_designs:
        current_design = unprinted_designs.pop()
        print("Printed model:"+current_design+".")
        completed_models.append(current_design)

def show_completed_models(completed_models):
    for completed_model in completed_models:
        print(completed_model) 


unprinted = ['iphone case','robot pendant','dodecahedron']
completed = []

print_models(unprinted,completed)
show_completed_models(completed)